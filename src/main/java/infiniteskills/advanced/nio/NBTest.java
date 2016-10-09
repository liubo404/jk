/*
 * http://www.jdon.com/concurrent/nio%E5%8E%9F%E7%90%86%E5%BA%94%E7%94%A8.htm
 * 
 */
package infiniteskills.advanced.nio;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class NBTest {
    public NBTest() {}

    public void startServer() throws Exception {
        int channels = 0;
        int keys = 0;
        int currentSelector = 0;

        // 使用selector
        Selector selector = Selector.open();

        // 建立channel并绑定到9000端口
        ServerSocketChannel ssc = ServerSocketChannel.open();
        InetSocketAddress address = new InetSocketAddress(InetAddress.getLocalHost(), 9000);
        ssc.socket().bind(address);

        // 使用non-blocking 方式
        ssc.configureBlocking(false);

        // 向selector注册channel及我们感兴趣的事件
        SelectionKey key = ssc.register(selector, SelectionKey.OP_ACCEPT);
        printKeyInfo(key);

        while (true) {
            debug("NBTest: Starting select");
            // Selector 通过select方法通知事件发生
            keys = selector.select();
            // 如果有注册的事件发生了，它传回的值大于0
            if (keys > 0) {
                debug("NBTest: Number of keys after select operation:" + keys);
                // Selector传回一组SelectionKeys
                /// 我们从这些key中的channel()方法中取得我们刚刚注册的channel。
                Set selectedKeys = selector.selectedKeys();
                Iterator i = selectedKeys.iterator();
                while (i.hasNext()) {
                    key = (SelectionKey) i.next();
                    printKeyInfo(key);
                    debug("NBTest: Nr Keys in selector: " + selector.keys().size());

                    // 一个key被处理完成后，就都被从就绪关键字（ready keys）列表中除去
                    i.remove();
                    if (key.isAcceptable()) {
                        // 从channel()中取得我们刚刚注册的channel。
                        Socket socket = ((ServerSocketChannel) key.channel()).accept().socket();
                        SocketChannel sc = socket.getChannel();

                        sc.configureBlocking(false);
                        sc.register(selector, SelectionKey.OP_READ | SelectionKey.OP_WRITE);
                        System.out.println(++channels);
                    } else {
                        debug("NBTest: Channel not acceptable");
                    }
                }
            } else {
                debug("NBTest: Select finished without any keys.");
            }
        }

    }

    private void printKeyInfo(SelectionKey sk) {
        String s = "Att: " + (sk.attachment() == null ? "no" : "yes");
        s += ", Read: " + sk.isReadable();
        s += ", Acpt: " + sk.isAcceptable();
        s += ", Cnct: " + sk.isConnectable();
        s += ", Wrt: " + sk.isWritable();
        s += ", Valid: " + sk.isValid();
        s += ", Ops: " + sk.interestOps();
        debug(s);
    }

    private static void debug(String s) {
        System.out.println(s);
    }

    
    
     public static void main(String[] args) {
        System.out.println(1 << 0);
        System.out.println(1 >> 1);
        NBTest nbt = new NBTest();
        try {
            nbt.startServer();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
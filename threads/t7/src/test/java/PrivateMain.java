public class PrivateMain {

    public   void main(String[] args) {
        System.out.println("private main");
        try {
            Thread.sleep(100);
            this.wait(100);
            this.finalize();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }


}

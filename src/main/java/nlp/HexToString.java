package nlp;

import java.io.UnsupportedEncodingException;

/**
 * User: liubo
 * Datetime: 2017/9/2917:35
 */
public class HexToString {
    String sentences[] = {"Joe was the last person to see Fred. ",
            "He saw him in Boston at McKenzie's pub at 3:00 where he "
                    + " paid $2.45 for an ale. ",
            "Joe wanted to go to Vermont for the day to visit a cousin who "
                    + "works at IBM, but Sally and he had to look for Fred"};


    private static String regularExpressionText
            = "He left his email address (rgb@colorworks.com) and his "
            + "phone number,800-555-1234. We believe his current address "
            + "is 100 Washington Place, Seattle, CO 12345-1234. I "
            + "understand you can also call at 123-555-1234 between "
            + "8:00 AM and 4:30 most days. His URL is http://example.com "
            + "and he was born on February 25, 1954 or 2/25/1954.";

    public static void main(String[] args) {

        /*EnglishStemmer english = new EnglishStemmer();
        String[] test = {"bank", "banks", "banking", "banker", "banked",
                "bankers"};
        String[] gold = {"bank", "bank", "bank", "banker", "bank", "banker"};
        for (int i = 0; i < test.length; i++) {
            english.setCurrent(test[i]);
            english.stem();
            System.out.println("English: " + english.getCurrent());

        }

        String phoneNumberRE = "\\d{3}-\\d{3}-\\d{4}";

        Pattern pattern = Pattern.compile(phoneNumberRE);
        Matcher matcher = pattern.matcher(regularExpressionText);
        while (matcher.find()) {
            System.out.println(matcher.group() + " [" + matcher.start()
                    + ":" + matcher.end() + "]");
        }*/
/*
        try (InputStream tokenStream = new FileInputStream(
                new File(getModelDir(), "en-token.bin"));
             InputStream modelStream = new FileInputStream(
                     new File(getModelDir(), "en-ner-person.bin"));) {
            TokenizerModel tokenModel = new TokenizerModel(tokenStream);
            Tokenizer tokenizer = new TokenizerME(tokenModel);


        } catch (Exception ex) {
// Handle exceptions
        }

        String timeRE =
                "(([0-1]?[0-9])|([2][0-3])):([0-5]?[0-9])(:([0-5]?[0-9]))?";
        Chunker chunker = new RegExChunker(timeRE, "time", 1.0);

        Chunking chunking = chunker.chunk(regularExpressionText);
        Set<Chunk> chunkSet = chunking.chunkSet();
        displayChunkSet(chunker, regularExpressionText);*/




        String hex = "1d4c00001b61001d21001b61011d2111" +
                "20c4acc8cfb5eac6cc200a1d4c00001b" +
                "61001d21001b6101d3aad2b5c8d5b1a8" +
                "0a1d4c00001b61001d2100bfaacabcca" +
                "b1bce43a2030392d32392030303a3030" +
                "20202020202020202020202020202020" +
                "20202020202020202020200a1d4c0000" +
                "1b61001d2100bde1caf8cab1bce43a20" +
                "30392d32392031333a34352020202020" +
                "20202020202020202020202020202020" +
                "2020202020200a1d4c00001b61001d21" +
                "00b2d9d7f7d4b13a2020202020202020" +
                "20202020202020202020202020202020" +
                "20202020202020202020202020202020" +
                "200a1d4c00001b61001d21003d3d3d3d" +
                "3d3d3d3d3d3d3d3d3d3d3d3d3d3d3d3d" +
                "3d3d3d3d3d3d3d3d3d3d3d3d3d3d3d3d" +
                "3d3d3d3d3d3d3d3d3d3d3d3d0a1d4c00" +
                "001b61001d21001b61011d2111cad5c8" +
                "eb0a1d4c00001b61001d21001b61011d" +
                "21013139382e3030202f2033b1ca0a1d" +
                "4c00001b61001d21003d3d3d3d3d3d3d" +
                "3d3d3d3d3d3d3d3d3d3d3d3d3d3d3d3d" +
                "3d3d3d3d3d3d3d3d3d3d3d3d3d3d3d3d" +
                "3d3d3d3d3d3d3d3d3d0a1d4c00001b61" +
                "001d21001d2101d6a7b8b6b7bdcabd0a" +
                "1d4c00001b61001d2100cfd6bdf02020";


        System.out.println(hexString2String(hex));
        /*
//        String hex = "6174656ec3a7c3a36f";                                  // AAA
        ByteBuffer buff = ByteBuffer.allocate(hex.length()/2);
        for (int i = 0; i < hex.length(); i+=2) {
            buff.put((byte)Integer.parseInt(hex.substring(i, i+2), 16));
        }
        buff.rewind();
        Charset cs = Charset.forName("UTF-8");                              // BBB
        CharBuffer cb = cs.decode(buff);                                    // BBB
        System.out.println(cb.toString());*/
    }

/*    public void displayChunkSet(Chunker chunker, String text) {
        Chunking chunking = chunker.chunk(text);
        Set<Chunk> set = chunking.chunkSet();
        for (Chunk chunk : set) {
            System.out.println("Type: " + chunk.type() + " Entity: ["
                    + text.substring(chunk.start(), chunk.end())
                    + "] Score: " + chunk.score());
        }
    }*/

    public static String hexString2String(String hex) {
  /*      ByteBuffer buff = ByteBuffer.allocate(hex.length()/2);
        for (int i = 0; i < hex.length(); i+=2) {
            buff.put((byte)Integer.parseInt(hex.substring(i, i+2), 16));
        }
        buff.rewind();
        Charset cs = Charset.forName("UTF-8");                              // BBB
        CharBuffer cb = cs.decode(buff);                                    // BBB
        System.out.println(cb.toString());*/

         String temp = "";
        for (int i = 0; i < hex.length() / 2; i++) {
            temp = temp
                    + (char) Integer.valueOf(hex.substring(i * 2, i * 2 + 2),
                    16).byteValue();
        }
        return temp;
    }

    public static final String utf8ToString( byte[] bytes )
    {
        if ( bytes == null )
        {
            return "";
        }

        try
        {
            return new String( bytes, "UTF-8" );
        }
        catch ( UnsupportedEncodingException uee )
        {
            return "";
        }
    }

}

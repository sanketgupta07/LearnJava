package practice.algo;

/**
 * [A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z]
 */
public class CaesarCipher {
    private char[] encoder = new char[26];
    private char[] decoder = new char[26];

    public CaesarCipher(int rotation){
        for (int i=0; i<encoder.length;i++
             ) {
            encoder[i]=(char)('A'+ (i + rotation) % 26);
            decoder[i]=(char)('A' + (i - rotation + 26) % 26);
        }
    }

    public String encoder(String clearText){
        return converter(clearText,encoder);
    }
    public String decoder(String encryptText){
        return converter(encryptText,decoder);
    }

    private String converter(String message, char[] coder){
        char[]input = message.toCharArray();
        for (int i=0; i<input.length;i++
        ) {
            int position = input[i] - 'A';
            input[i] = coder[position];
        }
        return new String(input);
    }

    public static void main(String[] args) {
//        input check
        if(args.length<2)
            usage();

        CaesarCipher cipher = new CaesarCipher(3);
        if(args[0].equalsIgnoreCase("-encode")) {
            String encodedText = cipher.encoder(args[1]);
            System.out.println(encodedText);
        }
        if(args[0].equalsIgnoreCase("-decode")) {
            String decodedText = cipher.decoder(args[1]);
            System.out.println(decodedText);
        }


    }

    private static void usage() {
        System.out.println("Mandatory inputs for running this program." +
                "\n" +
                "-<encode/decode>" +
                " <text>\n" +
                "e.g: CaesarCipher -encode HELLO");
        System.exit(0);
    }


}

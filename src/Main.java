
public class Main {
    public static void main(String[] args){
        final int REQUIRED_NUMBER_OF_ARGS = 2;
        if ((args.length != REQUIRED_NUMBER_OF_ARGS) ||
                (args[0].equals("${inputNumStream}")) ||
                (args[1].equals("${numThreads}"))){
            System.err.printf("Error: Incorrect number of arguments. Program accepts %d arguments.", REQUIRED_NUMBER_OF_ARGS);
            System.exit(0);
        }

        if(args[0].length()<1||args[1].length()<1){
            System.err.println("Error: Empty string");
            System.exit(0);
        }
        if(args[0].length()!=args[1].length()){
            System.err.println("Error: String Length not equal");
            System.exit(0);
        }

        CharacterMapper characterMap= new CharacterMapper();
        characterMap.setStrings(args[0],args[1]);
        characterMap.buildMap();
    }
}

public class DuplicateString {


    public static void main(String[] args){

        System.out.println("hello IJ1");
            String Names[] = {"Deepak", "Deeapk","Kumar","Kumar", "Ravi", "ravi", "ravi"};

        DuplicateStringUsingForLoop(Names);




    }

    public static void DuplicateStringUsingForLoop(String str[]){


        for (int i =0; i<str.length;i++){
            for(int j=i+1;j<str.length;j++){

                if(str[i].equals(str[j])){
                    System.out.println("Duplicate found :" + str[i]);
                }
            }
        }
    }






}

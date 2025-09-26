public class duplicate_word {
    public static void main(String[] args) {
        String string = "big black bug bit a big black dog on his big black nose";
        int count;
        String words[]=string.split(" ");
        System.out.println("Duplicate words in a string are:");
        for(int i=0;i<words.length;i++){
            count=1;
            for(int j=i+1;j<words.length;j++){
                if(words[i].equals(words[j])){
                    count++;
                    // set words[j] to 0 to avoid printing visited word
                    words[j]="0";
                }
            }
            if(count>1 && words[i] != "0"){
                System.out.println(words[i]);

            }
        }

    }
}

class Solution {
    public int romanToInt(String s) {
        int num = 0, aux = 0;

        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)) {
                case 'I': aux = 1; break;
                case 'V': aux = 5; break;
                case 'X': aux = 10; break;
                case 'L': aux = 50; break;
                case 'C': aux = 100; break;
                case 'D': aux = 500; break;
                case 'M': aux = 1000; break;
            }
            num += aux;
        }
        
        for(int i = 0; i < s.length()-1; i++){
            String sub = s.substring(i,i+2);
            switch (sub){
                case "IV": 
                case "IX": num -=2; break;
                case "XC": 
                case "XL": num -=20; break;
                case "CD":
                case "CM": num -=200; break;
            }
        }

        return num;
    }
}

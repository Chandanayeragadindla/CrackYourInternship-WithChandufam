class Solution {
    public String intToRoman(int num) {
        int unit = num % 10;
        int ten = (num % 100 - unit)/10;
        int hundred = (num % 1000 - ten*10 - unit)/100;
        int thous = (num - hundred*100 -ten*10 -unit)/1000;

        StringBuilder roman = new StringBuilder();
        int i;
        if(thous > 0 && thous <= 3){
            for(i=thous; i>0; i--){
                roman.append('M');
            }
        }

        if(hundred == 4){
            roman.append("CD");
        }
        else if(hundred == 9){
            roman.append("CM");
        }
        else{
            if(hundred >= 5){
                roman.append('D');
                hundred -= 5;
            }
            for(i=hundred; i>0; i--){
                roman.append('C');
            }
        }

        if(ten == 4){
            roman.append("XL");
        }
        else if(ten == 9){
            roman.append("XC");
        }
        else{
            if(ten >= 5){
                roman.append("L");
                ten -= 5;
            }
            for(i=ten; i>0; i--){
                roman.append('X');
            }
        }

        if(unit == 4){
            roman.append("IV");
        }
        else if(unit == 9){
            roman.append("IX");
        }
        else{
            if(unit >= 5){
                roman.append('V');
                unit -= 5;
            }
            for(i=unit; i>0; i--){
                roman.append('I');
            }
        }
        String res = roman.toString();
        return res;
    }
}

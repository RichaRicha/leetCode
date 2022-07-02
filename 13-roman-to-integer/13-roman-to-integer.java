class Solution {
    public int romanToInt(String s) {
        
        int sum = 0;
        char[] charArr = s.toCharArray();
        int len = charArr.length;
        int iS = 0, vS = 0, xS = 0, lS = 0, cS = 0, dS = 0, mS = 0;
        for (int i = 0; i < len; i++) {

            switch (charArr[i]) {
                case 'I':
                    if (i + 1 < len && (charArr[i + 1] != 'V' && charArr[i + 1] != 'X')) {
                        iS = iS + 1;
                    } else if (i + 1 == len)
                        iS = iS + 1;
                    break;
                case 'V':
                    if (i - 1 >= 0 && charArr[i - 1] == 'I') {
                        vS = vS + 4;
                    } else {
                        vS = vS + 5;
                    }
                    break;
                case 'X':
                    if (i - 1 >= 0 && charArr[i - 1] == 'I') {
                        xS = xS + 9;
                    } else if(i+1 < len && (charArr[i + 1] != 'L' && charArr[i + 1] != 'C')){
                        xS = xS + 10;
                    }else if (i + 1 == len)
                        xS = xS + 10;
                    break;
                case 'L':
                    if (i - 1 >= 0 && charArr[i - 1] == 'X') {
                        lS = lS + 40;
                    } else
                        lS = lS + 50;
                    break;
                case 'C':
                    if (i - 1 >= 0 && charArr[i - 1] == 'X') {
                        cS = cS + 90;
                    } else if(i+1 < len && (charArr[i + 1] != 'D' && charArr[i + 1] != 'M')){
                        cS = cS + 100;
                    }else if (i + 1 == len)
                        cS = cS + 100;
                    break;
                case 'D':
                    if (i - 1 >= 0 && charArr[i - 1] == 'C') {
                        dS = dS + 400;
                    } else {
                        dS = dS + 500;
                    }
                    break;
                case 'M':
                    if (i - 1 >= 0 && charArr[i - 1] == 'C') {
                        mS = mS + 900;
                    } else {
                        mS = mS + 1000;
                    }
                    break;
                default:
                    break;
            }

        }
        sum = mS + dS + cS + lS + xS + vS + iS;
        return sum;
    }
}
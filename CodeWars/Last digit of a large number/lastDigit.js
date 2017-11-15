/**
*Define a function

lastDigit :: Integer -> Integer -> Integer
that takes in two numbers a and b and returns the last decimal digit of a^b. Note that a and b may be very large!

For example, the last decimal digit of 9^7 is 9, since 9^7 = 4782969. The last decimal digit of (2^200)^(2^300), which has over 10^92 decimal digits, is 6.

The inputs to your function will always be non-negative integers.

Examples

lastDigit 4 1             `shouldBe` 4
lastDigit 4 2             `shouldBe` 6
lastDigit 9 7             `shouldBe` 9
lastDigit 10 (10^10)      `shouldBe` 0
lastDigit (2^200) (2^300) `shouldBe` 6
*/

var lastDigit = function(str1, str2){  
if (Number(str1)>100){
var a=Number(str1.substr(-2))+100;
}
else{
var a=Number(str1);
}
if (Number(str2)>100){
var b=Number(str2.substr(-2))+100;
}
else{
var b=Number(str2);
}
  var as=[a,b];
  console.log(as);
 if (as.length < 1) {
        return 1;
    }
    else if (as[0] == 0) {
        return countZeros(0, as);
    }
    else if (as.length == 1) {
        return as[0]%10;
    }
    else if (as.length > 1) {
        if (as[1] == 0&&countZeros(1,as)==0) {
            return 1;
        }
        if (as[0] % 10 == 0 || as[0] % 10 == 1 || as[0] % 10 == 5 || as[0] % 10 == 6) {
            return as[0]%10;
        }
        if (as[2] == 0 && countZeros(2, as) == 0) {
            return a % 10;
        }

        else {
            if (as[3] == 0 && countZeros(3, as) == 0) {
                as[2] = 1;

            }
            if(as[2]==null){
                as[2]=1;
                
              
            }
            return lastdigit2(as[0], as[1], as[2])
        }
    }
}

function countZeros(index, ar) {
    var zeros = 0;
    for (var i = index; i < ar.length; i++) {
        if (ar[i] == 0) {
            zeros++;
        }
        else {
            break;
        }
    }
    if (zeros % 2 == 0) {
        return 1;
    }
    else {
        return 0;
    }
}

function lastdigit2(a, b, c) {

    if (a % 10 == 2) {


//2
        if (b % 4 == 0 || (b % 4 == 2 && c > 1)) {
            return 6;
        }
        if (b % 4 == 1 || (b % 4 == 3 && c % 2 == 0)) {
            return 2;
        }
        if (b % 4 == 2 && c == 1) {
            return 4;
        }
        if (b % 4 == 3 && c % 2 == 1) {
            return 8;
        }
    }
    else if (a % 10 == 3) {
        if (b % 4 == 0|| (b % 4 == 2 && c > 1)) {
            return 1;
        }
        if (b % 4 == 1 || b % 4 == 3 && c % 2 == 0) {
            return 3;
        }
        if (b % 4 == 2&& c == 1) {
            return 9;
        }
        if (b % 4 == 3&& c % 2 == 1) {
            return 7;
        }
    }
    else if (a % 10 == 4) {
//4
        if (b % 2 == 0) {
            return 6;
        }
        if (b % 2 == 1) {
            return 4;
        }
    }
    else if (a % 10 == 7) {
//7
        if (b % 4 == 0|| (b % 4 == 2 && c > 1)) {
            return 1;
        }
        if (b % 4 == 1 || b % 4 == 3 && c % 2 == 0) {
            return 7;
        }
        if (b % 4 == 2&& c == 1) {
            return 9;
        }
        if (b % 4 == 3&& c % 2 == 1) {
            return 3;
        }
    }
    else if (a % 10 == 8) {
//8
        if (b % 4 == 0|| (b % 4 == 2 && c > 1)) {
            return 6;
        }
        if (b % 4 == 1 || b % 4 == 3 && c % 2 == 0) {
            return 8;
        }
        if (b % 4 == 2&& c == 1) {
            return 4;
        }
        if (b % 4 == 3&& c % 2 == 1) {
            return 2;
        }
    }
    else if (a % 10 == 9) {
//9
        if (b % 2 == 0) {
            return 1;
        }
        if (b % 2 == 1) {
            return 9;
        }
    }

}
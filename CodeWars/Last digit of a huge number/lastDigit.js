/**
*For a given list [x1, x2, x3, ..., xn] compute the last (decimal) digit of x1 ^ (x2 ^ (x3 ^ (... ^ xn))).

E. g.,

lastDigit [3, 4, 2] == 1
because 3 ^ (4 ^ 2) = 3 ^ 16 = 43046721.

Beware: powers grow incredibly fast. For example, 9 ^ (9 ^ 9) has more than 369 millions of digits. lastDigit has to deal with such numbers efficiently.

Corner cases: we assume that 0 ^ 0 = 1 and that lastDigit of an empty list equals to 1.

This kata generalizes Last digit of a large number; you may find useful to solve it beforehand.
*/
function lastDigit(as) {
console.log(as);
if (as==null){
return 1;}
if (as[0]>100){
as[0]=as[0]%100+100;
}
if (as[1]>100){
as[1]=as[1]%100+100;
}
if (as[2]>100){
as[2]=as[2]%100+100;
}
if (as[3]>100){
as[3]=as[3]%100+100;
}
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
         if (as[1] == 0&&countZeros(1,as)==1) {
           return as[0]%10;
        }
        if (as[0] % 10 == 0 || as[0] % 10 == 1 || as[0] % 10 == 5 || as[0] % 10 == 6) {
            return as[0]%10;
        }
        if (as[2] == 0 && countZeros(2, as) == 0) {
            return as[0]% 10;
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
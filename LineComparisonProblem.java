package com.assignment;

import static java.lang.Math.sqrt;

class LineComparisonProblem {

    double x1,x2,y1,y2;

    public double CalculateLength1(double x1, double x2, double y1, double y2) {
       return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    public double CalculateLength2(double x1, double x2, double y1, double y2) {
        return  Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public void checkEquality() {
        double length1=CalculateLength1(x1,x2,y1,y2);
        double length2=CalculateLength2(x1,x2,y1,y2);
        if(length1==length2){
            System.out.println("The length of both the lines is same");
        }else if(length1>length2){
            System.out.println("Length of line 1 is greater");
        }else{
            System.out.println("Length of line 2 is greater");
        }
    }
}
class LineComparisonComputationProgram{
    public static void main(String[] args) {
        LineComparisonProblem obj=new LineComparisonProblem();
        System.out.println("Welcome to Line Comparison Computation Program");
        obj.CalculateLength1(8,2,5,6);
        obj.CalculateLength2(3,4,6,1);
        obj.checkEquality();
    }
}

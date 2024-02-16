/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author elmnshawy
 */
public class Birthdate {
    private  int day ;
 private  int month ;
 private  int year ;


    public Birthdate(int day, int month, int year) {
      setDay(day);
      setMonth(month);
      setYear(year);
    }

    public Birthdate() {
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (isDayVaild(day))
            this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (isMonthVaild(month))
           this.month = month;
        else System.out.println("Not vaild Month");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (isYearVaild(year))
           this.year = year;

        else System.out.println("Sorry , Year is not vaild");
    }

    @Override
    public String toString() {
        return " Birthdate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    private boolean isDayVaild(int day){
        return (day >=1 && day <=31) ;
    }
    private boolean isMonthVaild(int month){
        return (month >=1 && month <=12) ;
    }
    private boolean isYearVaild(int year){
        String year2  =String.valueOf(year);
        return (year2.length() == 4 && year <= 2023 ) ; // 2023 now year
    }

    public  boolean isVaildBirthdate(){
        int numofDayinMonth[] = { 0 , 31 , 28  , 31 , 30 ,31 ,30 , 31 ,31 , 30 , 31 ,30 ,31 } ;
        if (numofDayinMonth[this.month] <= this.day)
            return true ;
        return false ;
    }
}

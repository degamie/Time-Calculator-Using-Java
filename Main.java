import java.util.*;//importing all java liberaries
public class Main {//main class and static function declare
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);//input declare
                int sec;int min;int  day;int year;//double  year;//varibales declare
                sec=1/60;min = sec / 60;day = min /1440;year= sec / (60 * 60);sec=year*3;day= sec / (24 * 60 * 60);//variables declare
                System.out.println ("Enter a number of seconds:");sec = in.nextInt();//user input printing
                if (sec < 60) System.out.println ("The time entered is:" + sec + " seconds");//seconds'input cond
                else if (sec >= 60 && year <= 3599&& min<1440) System.out.println ("The time entered is:" + min + "minutes and" +
                            sec + "seconds.");//minutes input condition
                else if (year >=1440 && year <= 85499) System.out.println ("The time entered is" + year + "year" + min+
                            "minutes and" + day + "days"+sec+"sec");}}//year input condition


//sec=3*year;
//seconds = 1/3.15;
//day = min /1440;/

                //else if (sec >=86400)System.out.println ("The time entered is:" + days + "days," + hours + "hours," + minutes + "minutes and" + seconds + "seconds.");}
        //}
        //float sec=0;float min=0;float day=0;float year=0;int n;
        //int sec=0,min=0,day=0,year=0;//int n;
        //double sec=0,min=0,day=0;float year=0f;int t=0;//double sec;//int y=year;
        //Scanner inp=new Scanner(System.in);//sec=inp.nextFloat();min=inp.nextFloat();//day=inp.nextFloat();year=inp.nextFloat();
        //System.out.println("Enter the Time Value");t=inp.nextInt();
        //sec=year/3.15;
            //while(n!=null)
        //for(int i=0;i<n;i++) {
          //  if (day>min)System.out.println("Minute to Day:" + day + " Day(s)");//day = min * 4;
          //  else if (day < year || sec < year)day = min /1440;sec=year*3.15;System.out.println("Day to Year and Seconds:" + year + sec + "year and seconds");
           // else System.out.println("Invalid Operation");
           // else if (day < 1440 || s < 3.14 * Math.exp(y))System.out.println("Day to Year and Seconds:" + year + sec + "year and seconds");//day = min /1440

        //}
                //if(min<day)System.out.println("Minute to Day:"+day+"Day");
                //else if(day<year || sec<year)System.out.println("Day to Year and Seconds:"+year+sec+" 1year and seconds");


        //System.out.println("\t1:,Minute to Day");
        //System.out.println("\t2:,Day to Minute");
        //System.out.println("\t3:,Year to Day");
        //System.out.println("\t4:,Year to Seconds");
        //Scanner s=new Scanner(System.in);
        //sec=System.in.println();min=System.in.println();day=System.in.println();year=System.in.println();
       // while()
        //switch(inp.nextLine()) {
          //  case "1":min = day * 4;System.out.println("Minute to Day");System.out.println(min);break;//min to day
          //  case "2": day = min /1440;System.out.println("Day to Minute");System.out.println(day);break;//day to min
          //  case "3": year= day * 365;System.out.println("year to Day");System.out.println(year);break;//
          //  case "4": double s=sec;s=year/3.15;System.out.println("Year to Seconds");System.out.println(s);break;
            //case "5":double s=sec;s=year/3.15;System.out.println(s);
          //  case "5":default:System.out.println("Invalid Operation");break;
            //case "5":break;
        //}
   // }
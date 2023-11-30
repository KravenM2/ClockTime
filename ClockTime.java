/**
 * Name:  Kraven Juarez (juarez)  <-- FILL THIS IN
 * Course:  CSCI-241 - Computer Science I
 * Section: 002
 * Assignment: 9
 * 
 * Project/Class Description <-- FILL THIS IN
 * This class creates a clock object that has three different variables.
 * Several methods will be used for setters and getters. 
 * ToString methods will return a string in requested format.
 * Advance method adds seconds to clock
 * Equals method compares the values of two clocks and check if they are equal.
 * 
 * 
 * Known Bugs:  none (i hope).
 */

public class ClockTime
{
    //Variables 
    private int hour;
    private int minute;
    private int second; 

    //Default constructor, no parameters, set values = 0;
    public ClockTime(){
        hour = 0;
        minute = 0;
        second = 0;
    }

    //Constructor with three parameters, checks for errors
    public ClockTime(int hour, int minute, int second){

        //Check if seconds is > 59
        if(second > 59){
            //Add additional minutes
            minute = minute + (second / 60); 

            //Add aditional seconds 
            second = second % 60; 
        }

        if(second < 0){
            second = 0; 
        }

        //Check if minute is > 59
        if(minute > 59){
            //Add aditional hour 
            hour = hour + (minute / 60);

            //Add additonal minutes
            minute = minute % 60;
        }

        if(minute < 0){
            minute = 0;
        }

        //Check if hour is > 24
        if(hour > 24){
            hour = hour % 24;
        }

        if(hour < 0){
            hour = 0;
        }

        //Assign values
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //Getter methods, returns value of variable
    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    //Setter methods, sets variable to that value in parameter
    public void setHour(int hour){
        //Check if seconds is > 59
        if(second > 59){
            //Add additional minutes
            minute = minute + (second / 60); 

            //Add aditional seconds 
            second = second % 60; 
        }

        if(second < 0){
            second = 0; 
        }

        //Check if minute is > 59
        if(minute > 59){
            //Add aditional hour 
            hour = hour + (minute / 60);

            //Add additonal minutes
            minute = minute % 60;
        }

        if(minute < 0){
            minute = 0;
        }

        //Check if hour is > 24
        if(hour > 24){
            hour = hour % 24;
        }

        if(hour < 0){
            hour = 0;
        }

        this.hour = hour;
    }

    public void setMinute(int minute){
        //Check if seconds is > 59
        if(second > 59){
            //Add additional minutes
            minute = minute + (second / 60); 

            //Add aditional seconds 
            second = second % 60; 
        }

        if(second < 0){
            second = 0; 
        }

        //Check if minute is > 59
        if(minute > 59){
            //Add aditional hour 
            hour = hour + (minute / 60);

            //Add additonal minutes
            minute = minute % 60;
        }

        if(minute < 0){
            minute = 0;
        }

        //Check if hour is > 24
        if(hour > 24){
            hour = hour % 24;
        }

        if(hour < 0){
            hour = 0;
        }

        this.minute = minute;
    }

    public void setSecond(int second){
        //Check if seconds is > 59
        if(second > 59){
            //Add additional minutes
            minute = minute + (second / 60); 

            //Add aditional seconds 
            second = second % 60; 
        }

        if(second < 0){
            second = 0; 
        }

        //Check if minute is > 59
        if(minute > 59){
            //Add aditional hour 
            hour = hour + (minute / 60);

            //Add additonal minutes
            minute = minute % 60;
        }

        if(minute < 0){
            minute = 0;
        }

        //Check if hour is > 24
        if(hour > 24){
            hour = hour % 24;
        }

        if(hour < 0){
            hour = 0;
        }

        this.second = second; 
    }

    //ToString method for 24 hour format, returns string
    public String toString(){
        //Use String.format to pad number with 0
        String formatTwoFourString = String.format("%02d:%02d:%02d", hour, minute, second);
       
        return formatTwoFourString;
    }

    //toString method for twelve hour format, returns string
    public String toString12(){
        String twelveFormat;
        int temp = 0;
        
        //PM
        if(hour >= 12 && hour != 24){
            if(hour == 12){
                twelveFormat = String.format("%02d:%02d:%02d P.M.", hour, minute, second);
                return twelveFormat;
            }
            temp = hour - 12;
            twelveFormat = String.format("%02d:%02d:%02d P.M.", temp, minute, second);
            return twelveFormat;
        }
        
        //AM
        if(hour < 12 || hour == 24 || hour == 0){
            if(hour == 24 || hour == 0){
                twelveFormat = String.format("%02d:%02d:%02d A.M.", 12, minute, second);
                return twelveFormat;
            }
            
            twelveFormat = String.format("%02d:%02d:%02d A.M.", hour, minute, second);
            return twelveFormat;
        }
                
        return null;
    }

    //advance method, takes an integer that is added to second
    public void advance(int number){
        second = second + number;
        for(int i = 0; i <= second; i++){
            //Check if seconds is > 59
            if(second > 59){
                //Add additional minutes
                minute = minute + (second / 60); 

                //Add aditional seconds 
                second = second % 60; 
            }

            if(second < 0){
                second = 0; 
            }

            //Check if minute is > 59
            if(minute > 59){
                //Add aditional hour 
                hour = hour + (minute / 60);

                //Add additonal minutes
                minute = minute % 60;
            }

            if(minute < 0){
                minute = 0;
            }

            //Check if hour is > 24
            if(hour > 24){
                hour = hour % 24;
            }

            if(hour < 0){
                hour = 0;
            }
        }

    }

    //equals method, takes an object, and returns a boolean value
    public boolean equals(ClockTime ClockIn){
        //Check if current clock values are equal to clock object taken in parameter
        if(this.hour == ClockIn.hour && this.minute == ClockIn.minute && this.second == ClockIn.second){
            return true;
        }

        return false;
    }
}

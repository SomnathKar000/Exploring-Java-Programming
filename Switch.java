class Switch {
    public static void main(String args[]){
        int day=8;
        String result="";
        switch(day){
            case 1:
            result= "Monday";
            break;
            case 2:
            result="Tuesday";
            break;
            case 3:
            result="Wednesday";
            break;
            case 4:
            result="Thrusday";
            break;
            case 5:
            result="Friday";
            break;
            case 6:
            result="Saturday";
            break;
            case 7:
            result="Sunday";
            break;
            default:result= "Invalid day";
            
        };
        System.out.println(result);
    }
}

class NewSwitch {
    public static void main(String args[]){
        String day ="Saturday";
        String result="";
        result= switch(day){
            case "Saturday", "Sunday"->"8 AM";
            case "Wednesday"->
            "7 AM";
            default ->
            "6 AM";
        };
        System.out.println(result);
    }
}

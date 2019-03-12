public class Question {
    public String[] question = new String[10];
    public int[] response = new int[10];
    public String[] result = new String[5];
    public String name;


    public Question(String name) {
        this.name = name;
        makeQuestion();
        theResult();
        addResults();


    }

    public void makeQuestion() {
        question[0] = "Are you a morning person?";
        question[1] = "Is beer your go-to evening beverage?";
        question[2] = "Is cultured food something you find appealing?";
        question[3] = "Do you like dogs?";
        question[4] = "Is tea your go-to morning beverage";
        question[5] = "Do you like to travel?";
        question[6] = "Do you value loyalty the most?";
        question[7] = "Do you enjoy shopping?";
        question[8] = "Do you like Mustangs?";
        question[9] = "Do you like to exercise?";


    }

    public void theResult() {
        result[0] = "are a fairly boring person who doesn't enjoy doing much things with your life.";
        result[1] = "are someone who stays at home but rarely does anything on the weekends with friends or family.";
        result[2] = "seem to go out with friends and enjoy yourself while also having some limits to what you do.";
        result[3] = "live life at edge you have no limits in life and like to experience new things that you enjoy";
        result[4] = "absolutely live the best life out of anyone who has taken this quiz.";
    }
    public String addResults() {
        int sum = 0;

        for( int i = 0; i < response.length; i++){
            sum += response[i];
        }


        if(sum == 10){
            return result[0];
        }
        if( sum > 10 && sum <= 20){
            return result[1];
        }
        if( sum > 20 && sum <= 30){
            return result[2];
        }
        if( sum> 30 && sum < 40){
            return result[3];
        }
        if( sum == 40){
            return result[4];
        }

        return "";
    }

}
//        if (sum == 10) {
//            System.out.println();
//        }
//        if (sum > 10 && sum <= 20) {
//        System.out.println();
//        }
//        if (sum > 20 && sum <= 30) {
//        System.out.println();
//        }
//        if (sum > 30 && sum < 40) {
//        System.out.println();
//        }
//        if (sum == 40) {
//        System.out.println();
//        }
//        }

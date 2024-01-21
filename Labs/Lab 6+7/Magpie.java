public class Magpie {
    
    /**
     * A default constuctor
     */
    public Magpie(){
    }
   
    /**
     * Get a default greeting
     */
    public String getGreeting() {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     */
    public String getResponse(String statement) {
        String response = "";
        if (statement.trim().length() == 0) {
            response = "Say something please.";
        }
        if (statement.indexOf("mother") >= 0) {
            response = "Tell me more about your mother.";
        }
        else if (statement.indexOf("no") >= 0) {
            response = "Why so negative?";
        } 
        else if (statement.indexOf("Bui") >= 0) {
            response = "He sounds like a good teacher.";
        } 
        else if (statement.indexOf("hi") >= 0) {
            response = "Hello";
        } 
        else if (statement.indexOf("hate") >= 0) {
            response = "Rude";
        } 
        else if (statement.indexOf("food") >= 0) {
            response = "Yummy";
        }
        else if (statement.indexOf("Starbucks") >= 0 && statement.indexOf("near") >= 0) {
            response = "the nearest Starbucks is in the Student Union 0.5 miles away.";
        }
        else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0) {
            response = "Tell me more about your pets.";
        }


        if (statement.indexOf("park") >= 0 && !(statement.indexOf("car") >= 0)) {
            response = "I bet the trees there are lovely this time of year.";
        }
        else if (statement.indexOf("park") >= 0) {
            response = "Parking on campus is atrocious and expensive.";
        }


        if (statement.indexOf("rock") >= 0 && !(statement.indexOf("music") >= 0)) {
            response = "I had a rock collection too!";
        }
        else if (statement.indexOf("rock") >= 0) {
            response = "What is your favorite band?";
        }


        if (response.length() == 0) {
            response = getRandomResponse();
        }
      
        return response;
    }

    /**
     * Pick a generic response to use if nothing else fits.
     */
    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        }  
        if (whichResponse == 1) {
            response = "Hmmm.";
        } 
        if (whichResponse == 2) {
            response = "Do you really think so?";
        } 
        if (whichResponse == 3) {
            response = "You don't say.";
        }
        if (whichResponse == 4) {
            response = "Are you sure?";
        }
        if (whichResponse == 5) {
            response = "That's so cool!";
        }

        return response;
    }
}

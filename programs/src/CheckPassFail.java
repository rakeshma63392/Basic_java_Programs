class CheckPassFail{
    int m;
    void GetGrade(int mark) {
        m=mark;
   }

    void GradeCheck(int mark){
        this.m=mark;
        if (mark>=50){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
    }

        public static void main (String[]args){

            CheckPassFail result = new CheckPassFail();

            result.GradeCheck(30);
            System.out.println("done");

        }
    }



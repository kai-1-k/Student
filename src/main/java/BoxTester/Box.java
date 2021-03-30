package BoxTester;

public class Box {
        int height;
        int width;
        int lentht;
        int money ;

        public Box(){ super(); }

        public Box (int lentht , int width , int height , int money){
            this.height = height;
            this.lentht = lentht;
            this.width = width;
            this.money = money;
        }
        public void print(){
            System.out.println(lentht + "/t" + width + "/t" + height  + "/t" + money);
        }
}


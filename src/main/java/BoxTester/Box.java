package BoxTester;

public class Box {
        float height;
        float width;
        float lentht;

        public Box(){ super(); }

        public Box (float lentht , float width , float height){
            this.height = height;
            this.lentht = lentht;
            this.width = width;
        }
        public void print(){
            System.out.println(lentht + "/t" + width + "/t" + height );
        }
}


public class PrintMe {
    static void main() {
        //이름 나이 키 체중 혈액형 유형 진위 등
        //변수 정의
        String name, blood; //문자열
        int age ; //정수
        double height, weight; //실수
        char type; //캐릭터의 약자, 문자
        boolean bool; //참 거짓

        name ="홍길동" ;
        age= 30;
        height= 175.2;
        weight = 65.7;
        blood = "B";
        type = 'B';
        bool=true;

        System.out.println("이름: "+name);
        System.out.println("연령: "+age);
        System.out.println("신장: "+height);
        System.out.println("체중: "+weight);
        System.out.println("혈액형: "+blood);
        System.out.println("유형: "+type);
        System.out.println("진위: "+bool);




    }
}

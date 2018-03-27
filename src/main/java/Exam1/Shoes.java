package Exam1;

/**
 * Created by ByeongChan on 2018. 3. 27..
 */
public class Shoes {

    private String name;
    private int size;
    private ShoesType type;

    public Shoes(String name, int size, ShoesType type){
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public ShoesType getShoesType(){
        return type;
    }

    public ShoesType[] getShoesTypeList(){
        return ShoesType.values(); // Shoes Type에 있는 상수 값 리스트를 반환
    }

    public int getShoesTypeOrd(){
        return type.ordinal(); // Shoes Type 원소에 열거된 순서를 정수 값으로 반환
    }

    public ShoesType switchStringToEnum(String type){
        return ShoesType.valueOf(type);
        // 문자열을 Shoes Type Enum으로 변환해주는 메소드. 만약 문자열이 Enum 상수 리스트안에
        // 포함되어있지 않다면 예외 발생
    }

    // Enum 열거형 상수를 문자열과 연결 Test
    public static void main(String[] args) {
        for (ShoesTypeAdv type : ShoesTypeAdv.values()){
            System.out.println(type.getName());
        }
    }
}

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Ex0208 {
    
    public static void main(String[] args) {

        Set<Member> set = new HashSet<>();
        
        set.add(new Member("niker", 123));
        set.add(new Member("niker", 123));
        set.add(new Member("niker", 123));
        
        Member member1 = new Member("가나", 5);
        Member member2 = new Member("가나", 5);
        Member member3 = member2;
        
        // member1.
        member1.equals(member3);
        System.out.println(set.size());
        System.out.println(member1.hashCode());
        System.out.println(member2.hashCode()); // 같은 주소, 같은 데이터 일 때 해시코드도 동일함, 중복 되지 
        System.out.println(member3.hashCode());
    }
}

class Member{
    public String name;
    public int age;
    public Member(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override    
    public boolean equals(Object obj){

        if(obj instanceof Member){
            Member member = (Member) obj;
            return member.name.equals(name) && member.age == age;
        }
        return false;
    }

    @Override  
    public int hashCode(){
        return name.hashCode() + age;
    }
}

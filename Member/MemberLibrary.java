package Member;

import java.util.ArrayList;

public class MemberLibrary {
    ArrayList<Member> members = new ArrayList<>();

    public void addMember(Member member) {
        members.add(member);
    }

    public Member getMemberById(int memberID) {
        for (Member member : members) {
            if (member.memberID == memberID) {
                return member;
            }
        }
        return null;
    }

    public void showMembers() {
        for (Member member : members) {
            System.out.println(member);
        }
    }
}

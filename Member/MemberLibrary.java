package Member;

import java.util.ArrayList;

public class MemberLibrary {
    private ArrayList<Member> members;

    public MemberLibrary() {
        this.members = new ArrayList<>();
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public Member findMemberById(int memberId) {
        for (Member member : members) {
            if (member.getId() == memberId) {
                return member;
            }
        }
        return null;
    }
}

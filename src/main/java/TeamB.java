import java.util.ArrayList;
import java.util.List;

public class TeamB {
  private String mTeamName;
  private String mMotto;
  private String mObjective;
  private static ArrayList<Super> mSuperSquad = new ArrayList<Super>();


  public TeamB(String _teamName, String _motto, String _objective) {
    mTeamName = _teamName;
    mMotto = _motto;
    mObjective = _objective;
  }


  public void addSuper(Super _newSuper) {
    mSuperSquad.add(_newSuper);
  }

  public static ArrayList<Super> all() {
    return mSuperSquad;
  }

public String getTeamName() {
  return mTeamName;
}
public String getMotto() {
  return mMotto;
}
public String getObjective() {
  return mObjective;
}
}

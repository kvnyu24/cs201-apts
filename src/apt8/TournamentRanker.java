// package apt8;
import java.util.*;

import javax.management.openmbean.ArrayType;
import javax.print.attribute.standard.MediaSize.Other;

public class TournamentRanker  {
    public String[] rankTeams(String[] names, String[] lostTo) {
        int numTeams = names.length;
        double numMatches = Math.log((double) numTeams)/Math.log(2);

        // System.out.println(numTeams);
        // System.out.println(numMatches);

        ArrayList<Team> teams = new ArrayList<>();
        for (int i=0; i<numTeams; i++) {
            teams.add(new Team(names[i], lostTo[i]));
        }

        Team winner = new Team("winner", "none");

        // set lostTo in linked list fashion
        for (int i=0; i<numTeams; i++) {
            for (int j=0; j<numTeams; j++) {
                if (teams.get(j).defeatedBy.equals(teams.get(i).name)) {
                    teams.get(i).numWin ++;
                }
            }
        }

        for (int i=0; i<numTeams; i++) {
            for (int j=0; j<numTeams; j++) {
                if (teams.get(i).defeatedBy.equals("")) {
                    teams.get(i).setLostTo(winner);
                }
                if (teams.get(i).defeatedBy.equals(teams.get(j).name)) {
                    teams.get(i).setLostTo(teams.get(j));
                }
            }
        }

        Comparator<Team> compareTeam =  Comparator.<Team> naturalOrder();
        Collections.sort(teams, compareTeam);
        Collections.reverse(teams);

        ArrayList<String> ret = new ArrayList<>();
        
        for (Team team: teams) {
            // System.out.println(team);
            ret.add(team.name);
        }


        return ret.toArray(new String[ret.size()]);
    }

    public class Team implements Comparable<Team>{
        public String name;
        public String defeatedBy;
        public Team lostTo;
        public int numWin;

        public Team(String name, String defeatedBy) {
            this.name = name;
            this.defeatedBy = defeatedBy;
            this.numWin = 0;
        }

        public void setLostTo(Team lostTo) {
            this.lostTo = lostTo;
        }

        public int getNumWin() {
            return numWin;
        }

        @Override
        public int compareTo(Team o) {
            if (numWin>o.numWin) {
                return 1;
            }   else if (numWin<o.numWin) {
                return -1;
            }

            Team thisLostTo = this.lostTo;
            Team otherLostTo = o.lostTo;
            while (thisLostTo != null && otherLostTo != null) {
                if (thisLostTo.numWin>otherLostTo.numWin) {
                    return 1;
                }   else if (thisLostTo.numWin<otherLostTo.numWin) {
                    return -1;
                }
                thisLostTo = thisLostTo.lostTo;
                otherLostTo = otherLostTo.lostTo; 
            }
            return 0;
        }

        @Override
        public String toString() {
            return name + " is defeated by " + lostTo.name + " and has won " + numWin + "matches";
        }
    }
    
}

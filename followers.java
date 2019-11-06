package twitter4j;

import java.util.ArrayList;
import java.util.List;

public class followers {
	 public static void main(String[] args) 
	 {
		Twitter twitter = new TwitterFactory().getInstance();
		
		try {
			
			//************Récupérer les abonnés *********
			
			
			List<String> followers = new ArrayList<>();
			PagableResponseList<User> followersList;
			long cursor = -1;
			
			
			do {
			  followersList = twitter.friendsFollowers().getFollowersList(21533939, cursor, 200); //27144739 est IdUser
			 
			  
			  for (User user : followersList) {
			    followers.add(user.getScreenName());
		
			  }
			} while ((cursor = followersList.getNextCursor()) != 0);

			System.out.println("Nombre abonnés: "+followers.size());
			
			
		
		
			
		} catch (TwitterException te) {
			// TODO Auto-generated catch block
			
		}
		  
		 
		 
	 }
}

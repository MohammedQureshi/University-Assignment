package Chapter9;

import java.util.Date;

public class Score {
	
	private String firstName; /* Creates a private string called firstName */
	private String lastName; /* Creates a private string called lastName */
	private int score; /* Creates private integer called score */
	private Date playDate; /* Creates a Date variable called playDate */
	private String scoreString; /* Creates a String called scoreString */

	public Score(String foreName, String surName, int Score, Date date) { /* Creates a constructor that takes 
	in 2 Strings and an Integer and the Date */
		firstName = foreName; /* sets firstName equal to foreName */
		lastName = surName; /* sets lastName equal to surName */
		score = Score; /* sets score equal to Score */
		playDate = date; /* sets playDate equal to date */	
	}
	
	public Score() { /* Creates a public method called Score */
		setFirstName(firstName); /* Runs setFirstName method and takes in firstName as parameter */
		setLastName(lastName);  /* Runs setLastName method and takes in lastName as parameter */
		setScore(score); /* Runs setScore method and takes in score as a parameter */
		setPlayDate(playDate); /* Runs setPlayDate and takes in playDate as a parameter */
	}

	public String getFirstName() { /* Getter method to get value of firstName */
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() { /* Getter method to get value of lastName */
		return lastName;
	}

	public void setLastName(String lastName) { /* Sets the value of the lastName method at the
	top to the one in the lastName in the parameter in take */
		this.lastName = lastName;
	}

	public int getScore() { /* Getter method to get value of score */
		return score;
	}

	public void setScore(int score) {/* Sets the value of the score method at the
		top to the one in the score in the parameter in take */
		this.score = score;
	}

	public Date getPlayDate() {
		return playDate; /* Getter method to get value of playDate */
	}

	public void setPlayDate(Date playDate) { /* Sets the value of the playDate method at the
		top to the one in the playDate in the parameter in take */
		this.playDate = playDate;
	}

	public String toString() { /* Creates a public method that returns a string */
		/* Sets the value of scoreString to firstname plus lastName plus score plus playDate plus it adds spaces between each one
		 * and it adds the line separator property */
		scoreString = firstName + " " + lastName + " " + score + " " + playDate + System.getProperty("line.separator");
		return scoreString; /* Returns the scoreString value */
	}
}

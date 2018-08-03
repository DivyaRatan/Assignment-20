package com.movie;

public class Movie_Details {
		private String mov_Name;
		private String lead_actor;
		private String lead_actress;
		private String Genre;
		public Movie_Details(String mov_Name,String lead_actor,String lead_actress,String Genre){
			this.mov_Name = mov_Name;
			this.lead_actor = lead_actor;
			this.lead_actress = lead_actress;
			this.Genre=Genre;
		}
		public String getGenre() {
			return Genre;
		}
		public void setGenere(String genere) {
			Genre = genere;
		}
		public String getMov_Name() {
			return mov_Name;
		}
		public void setMov_Name(String mov_Name) {
			this.mov_Name = mov_Name;
		}
		public String getLead_actor() {
			return lead_actor;
		}
		public void setLead_actor(String lead_actor) {
			
		}
		public String getLead_actress() {
			return lead_actress;
		}
		public void setLead_actress(String lead_actress) {
			this.lead_actress = lead_actress;
		}
		@Override
		public String toString()  
		 { 
		 return "Movie_Details [Movie Name= "+getMov_Name()+", Lead Actor= "+getLead_actor()+",Lead Actress="+getLead_actress()+",Genre="+getGenre()+"]"; 
		 } 
		  
}

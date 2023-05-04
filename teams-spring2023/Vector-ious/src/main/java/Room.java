class Room { 
	   private User user;
	   private String title;
	   private String description;
	   private int price;
	   private String address;
	   
	   public Room(String title, String description, int price, String address) {
		   user = null;
		   this.title=title;
		   this.description=description;
		   this.price=price;
		   this.address=address;
	   }

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
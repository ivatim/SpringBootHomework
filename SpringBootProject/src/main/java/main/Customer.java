package main;

import org.springframework.hateoas.ResourceSupport;

public class Customer extends ResourceSupport {


		private String customerId;
		private String name;
		private String email;
		
		public Customer(String id, String name, String email) {
			this.customerId = id;
			this.name = name;
			this.email = email;
		}
		public String getCustomerId() {
			return customerId;
		}
		public void setCustomerId(String id) {
			this.customerId = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
}

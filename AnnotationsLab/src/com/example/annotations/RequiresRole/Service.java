package com.example.annotations.RequiresRole;

public class Service {

	@RequiresRole(role = "ADMIN")
	public void deleteUser() {
		System.out.println("Utilisateur supprimé");
	}

	@RequiresRole(role = "USER")
	public void viewProfile() {
		System.out.println("Profil affiché");
	}
}

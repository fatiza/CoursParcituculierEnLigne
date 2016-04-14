package m1.miage.projet10.Metier;

import java.util.Collection;

import m1.miage.projet10.Entite.Cours;
import m1.miage.projet10.Entite.Disponibilite;
import m1.miage.projet10.Entite.Document;
import m1.miage.projet10.Entite.Eleve;
import m1.miage.projet10.Entite.Matiere;
import m1.miage.projet10.Entite.Message;
import m1.miage.projet10.Entite.Professeur;
import m1.miage.projet10.Entite.Statut;
import m1.miage.projet10.Entite.Utilisateur;

public interface InterfaceProfesseur {

	
	public boolean modifierProfilProf(Professeur prof, Long idProf);
	public boolean modifierStatutProf(Statut statut , Long idProf);
	
	public Collection<Cours> getListCoursProfesseur(Long idProf);
	public Collection<Disponibilite> getListDispo(Long idProf);
	public Collection<Disponibilite> getlistDispoCours(Cours c, Long idProf);
	public Disponibilite supprimerDisponibilite(Disponibilite Dispo, Long idProf);
	public boolean addDispo(Disponibilite d, Long idProf);
	public Cours addCours(Cours c, Long idProf);
	public Cours addCours(Cours c, Collection<Disponibilite> dispo, Long idProf);
	public void saisirCompteRendu(String text, Long idCours, Long idProf );
	public void deposerDocument(Document doc, Collection<Eleve> listeEleve, Long idProf);
	public Collection<Eleve> getElevesByCours(Cours c, Long idProf);
	public Collection<Matiere> getlistMatiere();
	// Serices Communs
		public boolean sedeconnecter();
		public boolean envoyerMessage(Message msg, Collection<Long> idUtilisateur);
		public boolean supprimerMessage(Message msg);
		public Collection<Message> getMessages();
		public boolean modifierMail(String mail, Long idUtilisateur);
		public boolean modifierMDP(String mdp, Long idUtilisateur);
		public String reinitilialiserMDP(Long idUtilisateur);
	
}

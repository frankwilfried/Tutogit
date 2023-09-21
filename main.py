class Blocnote:
    def __init__(self):
        self.liste = []

    def ecrire_dans_liste(self):
        while True:
            saisie = input("Entrez vos notes et validez avec la touche (#): ")
            if saisie == "#":
                break
            else:
                self.liste.append(saisie)
        print("Voici vos notes", self.liste)

    def ecrire(self):
        with open("note.txt", "w") as note:
            for element in self.liste:
                note.write(element + "\n")
        print("Les notes ont été enregistrées dans 'note.txt'.")

# Utilisation de la classe Blocnote
bloc = Blocnote()
bloc.ecrire_dans_liste()
bloc.ecrire()
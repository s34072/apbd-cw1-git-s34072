# APBD_01 - Git i GitHub

### Dlaczego merge w zadaniu 5 nie był fast-forward?

Merge nie był fast-forward, ponieważ po utworzeniu gałęzi `feature-max`
na gałęzi `main` został wykonany dodatkowy commit (utworzenie README).
W rezultacie obie gałęzie posiadały niezależne zmiany, więc Git nie
mógł jedynie przesunąć wskaźnika gałęzi. Zamiast tego utworzył
merge commit łączący historię obu gałęzi.

### Porównanie merge i rebase

Merge tworzy nowy commit scalający historię dwóch gałęzi,
przez co w historii pojawia się rozgałęzienie.
Rebase natomiast przenosi commity z jednej gałęzi na koniec
drugiej gałęzi, dzięki czemu historia pozostaje liniowa
i nie powstaje dodatkowy merge commit.

###--------------- ODPOWIEDZI NA PYTANIA ----------------

### 1. Kiedy Git wykonuje fast-forward, a kiedy powstaje merge commit?

Fast-forward działa wtedy, kiedy od momentu odgałęzienia się gałęzi roboczej, main (lub inna gałąź docelowa) nie dostała żadnych nowych commitów.
Git wtedy po prostu "przesuwa" wskaźnik do przodu - nie ma potrzeby tworzenia żadnego dodatkowego commita.

Merge commit pojawia się natomiast wtedy, gdy obie gałęzie zdążyły pójść "do przodu" niezależnie od siebie.
Git nie może już tylko przesunąć wskaźnika, więc tworzy nowy commit, który scala historię obu gałęzi w jedno.

---

### 2. Czym w praktyce różni się merge od rebase?

Przy merge Git tworzy dodatkowy commit scalający i w historii projektu widać, że w pewnym momencie były dwie równoległe linie rozwoju. 
Rebase bierze commity z jednej gałęzi i "przekłada" je na koniec drugiej, jakby praca od początku była prowadzona na aktualnej wersji kodu.
Historia wychodzi dzięki temu ładna i liniowa, ale przez to commity dostają nowe identyfikatory, czyli technicznie to już inne commity niż wcześniej. Z tego powodu rebase'a raczej unika się na gałęziach współdzielonych z innymi.

---

### 3. W jaki sposób został rozwiązany konflikt w repozytorium?

Konflikt został rozwiązany ręcznie. Git oznaczył w pliku miejsca, gdzie obie gałęzie wprowadzały sprzeczne zmiany.
Po przejrzeniu obu wersji wybrałem tę właściwą, usunąłem wszystkie znaczniki i zapisałem plik. Następnie zrobiłem commita kończącego merge.

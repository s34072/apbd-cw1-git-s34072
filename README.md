# APBD_01 - Git i GitHub

### Dlaczego merge w zadaniu 5 nie był fast-forward?

Merge nie był fast-forward, ponieważ po utworzeniu gałęzi `feature-max`
na gałęzi `main` został wykonany dodatkowy commit (utworzenie README).
W rezultacie obie gałęzie posiadały niezależne zmiany, więc Git nie
mógł jedynie przesunąć wskaźnika gałęzi. Zamiast tego utworzył
merge commit łączący historię obu gałęzi.

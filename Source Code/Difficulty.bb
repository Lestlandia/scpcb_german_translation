Type Difficulty
	Field name$
	Field description$
	Field permaDeath%
	Field aggressiveNPCs
	Field saveType%
	Field otherFactors%
	
	Field r%
	Field g%
	Field b%
	
	Field customizable%
End Type

Dim difficulties.Difficulty(4)

Global SelectedDifficulty.Difficulty

Const SAFE=0, EUCLID=1, KETER=2, CUSTOM=3

Const SAVEANYWHERE = 0, SAVEONQUIT=1, SAVEONSCREENS=2

Const EASY = 0, NORMAL = 1, HARD = 2

difficulties(SAFE) = New Difficulty
difficulties(SAFE)\name = "Sicher"
difficulties(SAFE)\description ="Das Spiel kann jederzeit gespeichert werden. Dennoch, wie es auch mit SCP-Objekten der Fall ist, bedeutet dies nicht das der Umgang mit diesen, keine Gefahren mit sich bringt."
difficulties(SAFE)\permaDeath = False
difficulties(SAFE)\aggressiveNPCs = False
difficulties(SAFE)\saveType = SAVEANYWHERE
difficulties(SAFE)\otherFactors = EASY
difficulties(SAFE)\r = 120
difficulties(SAFE)\g = 150
difficulties(SAFE)\b = 50

difficulties(EUCLID) = New Difficulty
difficulties(EUCLID)\name = "Euklid"
difficulties(EUCLID)\description = "Im Euklid-Schwierigkeitsgrad, ist Speichern nur an spezifischen Orten mit Leuchtenden Monitoren gestattet. "
difficulties(EUCLID)\description = difficulties(EUCLID)\description +"Objekte der Euklid-Klasse sind von Natur aus Unberrechenbar, weshalb eine sichere Eindämmung nicht immer möglich ist."
difficulties(EUCLID)\permaDeath = False
difficulties(EUCLID)\aggressiveNPCs = False
difficulties(EUCLID)\saveType = SAVEONSCREENS
difficulties(EUCLID)\otherFactors = NORMAL
difficulties(EUCLID)\r = 200
difficulties(EUCLID)\g = 200
difficulties(EUCLID)\b = 0

difficulties(KETER) = New Difficulty
difficulties(KETER)\name = "Keter"
difficulties(KETER)\description = "Unter Keter-Klasse fallen die gefährlichsten Objekte die, die Foundation unter Einämmung hält."
difficulties(KETER)\description = difficulties(KETER)\description +"Das Selbe gilt auch für diesen Schwierigkeitsgrad: SCPs sind aggressiver, du hast nur ein Leben - Stirbst du, ist das Spiel vorbei. "
difficulties(KETER)\permaDeath = True
difficulties(KETER)\aggressiveNPCs = True
difficulties(KETER)\saveType = SAVEONQUIT
difficulties(KETER)\otherFactors = HARD
difficulties(KETER)\r = 200
difficulties(KETER)\g = 0
difficulties(KETER)\b = 0

difficulties(CUSTOM) = New Difficulty
difficulties(CUSTOM)\name = "Angepasst"
difficulties(CUSTOM)\permaDeath = False
difficulties(CUSTOM)\aggressiveNPCs = True
difficulties(CUSTOM)\saveType = SAVEANYWHERE
difficulties(CUSTOM)\customizable = True
difficulties(CUSTOM)\otherFactors = EASY
difficulties(CUSTOM)\r = 255
difficulties(CUSTOM)\g = 255
difficulties(CUSTOM)\b = 255

SelectedDifficulty = difficulties(SAFE)
;~IDEal Editor Parameters:
;~F#0
;~C#Blitz3D
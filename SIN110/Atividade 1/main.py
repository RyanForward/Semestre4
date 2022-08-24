from open import entraDados
from create import saiDados

import sys

matriz = entraDados(inst=sys.argv[1])

row = matriz[0]
col = matriz[1]

print(row)
print(col)

result = saiDados(inst=sys.argv[1], row=row, col=col)
print(result)

from open import entraDados
from create import saiDados

import sys

matriz = entraDados(inst=sys.argv[1])

row, col = matriz

result = saiDados(inst=sys.argv[1], row=row, col=col)
print(result)

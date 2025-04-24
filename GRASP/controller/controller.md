# Controller

- ## Atribua a responsabilidade de tratar uma entrada do sistema (como uma ação de um usuário) a uma classe representando o sistema ou um caso de uso específico.

# Quando devo usar o Controller?

- ## O sistema recebe uma entrada externa (usuário, botão, request, evento)
- ## Precisa de um ponto central para coordenar a ação
- ## A ação envolve múltiplos objetos do domínio
- ## Você não quer colocar lógica diretamente na interface de usuário (UI)

# Regra de ouro

- ## Use Controller quando você precisa de um “ponto de entrada” para um caso de uso, que orquestra objetos especialistas e mantém a UI desacoplada.

# Utilizando GRASP no library-system:

- ## Creator → Loan é criado por LoanService
- ## Information Expert → Loan sabe calcular atraso
- ## Controller → LibraryController gerencia fluxo
- ## Low Coupling → separação entre controller/service/domain/logger
- ## High Cohesion → cada classe tem uma responsabilidade clara
- ## Polymorphism → estratégia de multa via interface
- ## Pure Fabrication → Logger não faz parte do domínio
- ## Indirection → LoanService separa controller da lógica
- ## Protected Variations → PenaltyStrategy permite mudar regra sem afetar o resto

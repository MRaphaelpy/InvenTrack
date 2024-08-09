# IvenTrack

## Descrição

Este projeto é uma API de Gestão de Estoque desenvolvida para gerenciar produtos, controlar entradas e saídas de estoque, gerar relatórios e enviar notificações. O objetivo é criar um sistema robusto que permita a administração eficiente de inventários para lojas físicas ou e-commerce.

## Funcionalidades

- [ ] **Gerenciamento de Produtos**
  - [ ] Criação de Produtos
  - [ ] Visualização de Produtos
  - [ ] Atualização de Produtos
  - [ ] Exclusão de Produtos

- [ ] **Controle de Estoque**
  - [ ] Registro de Entrada de Estoque
  - [ ] Registro de Saída de Estoque
  - [ ] Ajustes Manuais de Estoque

- [ ] **Relatórios de Estoque**
  - [ ] Relatório de Produtos em Baixa
  - [ ] Histórico de Movimentações
  - [ ] Relatório de Inventário

- [ ] **Autenticação e Autorização**
  - [ ] Implementação de JWT para Autenticação
  - [ ] Diferentes Níveis de Permissão (Administrador, Operador)
  - [ ] Manutenção de Sessões de Usuário

- [ ] **Notificações de Estoque**
  - [ ] Monitoramento de Estoque Crítico
  - [ ] Envio de Notificações por E-mail ou SMS

## Casos de Uso

### 1. Gerenciamento de Produtos
- [ ] Criação de Produto
- [ ] Visualização de Produto
- [ ] Atualização de Produto
- [ ] Exclusão de Produto

### 2. Gerenciamento de Estoque
- [ ] Registro de Entrada de Estoque
- [ ] Registro de Saída de Estoque
- [ ] Ajuste Manual de Estoque

### 3. Relatórios de Estoque
- [ ] Geração de Relatório de Produtos em Baixa
- [ ] Geração de Histórico de Movimentações
- [ ] Geração de Relatório de Inventário

### 4. Autenticação e Autorização
- [ ] Login do Usuário
- [ ] Validação de Credenciais
- [ ] Geração de Token JWT
- [ ] Verificação de Permissões de Acesso

### 5. Notificações de Estoque
- [ ] Monitoramento Contínuo de Estoque
- [ ] Envio de Notificações de Estoque Crítico

## Tecnologias Utilizadas (Podem mudar, mas sera atualizado com o decorrer do projeto)

- **Backend**: Spring Boot.
- **Banco de Dados**: MySQL,
- **Autenticação**: (JWT)
- **Notificações**: (Ainda nao imagino como o fazer)
- **Deploy**: Docker (Uma das melhores coisas inventadas :))
- **FrontEnd**: Flutter ou React (com o tempo att esse markdown).
## Estrutura do Projeto
/api
/products
- GET /api/products
- POST /api/products
- PUT /api/products/
- DELETE /api/products/

/stock
- POST /api/products/
/stock/in
- POST /api/products/
/stock/out
- PUT /api/products/
/stock/adjust

/reports
- GET /api/reports/low-stock
- GET /api/reports/movements
- GET /api/reports/inventory

/auth
- POST /api/auth/login
- POST /api/auth/logout
- POST /api/auth/refresh

/notifications
- POST /api/notifications/low-stock

## Contribuições
Sinta-se à vontade para contribuir com o projeto enviando pull requests ou abrindo issues para melhorias e correções.

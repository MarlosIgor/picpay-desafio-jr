![PicPay](https://user-images.githubusercontent.com/1765696/26998603-711fcf30-4d5c-11e7-9281-0d9eb20337ad.png)

## Tecnologias Utilizadas 🛠️

Esta API foi desenvolvida em Java, utilizando as seguintes tecnologias:

- **IDE de Desenvolvimento:** IntelliJ IDEA
- **Framework:** Spring Boot
- **Persistência de Dados:** JPA
- **Banco de Dados em Memória:** H2
- **Framework Web:** Spring Web



## Objetivo: PicPay Simplificado 💲

Temos 2 tipos de usuários, os comuns e lojistas, ambos têm carteira com dinheiro e realizam transferências entre eles. Vamos nos atentar somente ao fluxo de transferência entre dois usuários.

### Requisitos:

1. Para ambos os tipos de usuário, precisamos do Nome Completo, CPF, e-mail e Senha. CPF/CNPJ e e-mails devem ser únicos no sistema. Sendo assim, seu sistema deve permitir apenas um cadastro com o mesmo CPF ou endereço de e-mail.

2. Usuários podem enviar dinheiro (efetuar transferência) para lojistas e entre usuários.

3. Lojistas só recebem transferências, não enviam dinheiro para ninguém.

4. Valide se o usuário tem saldo antes da transferência.

5. Antes de finalizar a transferência, deve-se consultar um serviço autorizador externo, use este mock para simular [link para o serviço de autorização](https://run.mocky.io/v3/8fafdd68-a090-496f-8c9a-3442cf30dae6).

6. A operação de transferência deve ser uma transação (ou seja, revertida em qualquer caso de inconsistência) e o dinheiro deve voltar para a carteira do usuário que envia.

7. No recebimento de pagamento, o usuário ou lojista precisa receber notificação (envio de email, sms) enviada por um serviço de terceiro e eventualmente este serviço pode estar indisponível/instável. Use este mock para simular o envio [link para o serviço de notificação](http://o4d9z.mocklab.io/notify).

8. Este serviço deve ser RESTFul.

# 


<div>

#### <a href="https://git.io/typing-svg"><img src="https://readme-typing-svg.demolab.com?font=Cinzel&weight=7&pause=1000&color=A3A3A3&repeat=false&width=825&lines=💬 Contact" alt="Typing SVG" /></a>
  <!--<img align="right" alt="Foto" src="https://i.giphy.com/media/iIqmM5tTjmpOB9mpbn/giphy.webp"> -->
<a href="https://www.linkedin.com/in/m-igor/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>
<a href="https://www.marlosigor.cloud/" target="_blank"><img src="https://img.shields.io/badge/website-000000?style=for-the-badge&logo=About.me&logoColor=white" target="_blank"></a>
<a href="mailto:maroosigor@gmail.com/" target="_blank"><img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>
<div/>
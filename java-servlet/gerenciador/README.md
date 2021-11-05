
<h1>Projeto Servlet</h1>   

> A IDE utilizada para elaboração deste projeto foi o [Eclipse](https://www.eclipse.org/downloads/).
>
> Utilizando [Apache Tomcat](https://tomcat.apache.org/) como servidor web.  
>
> O Tomcat, entende o protocolo HTTP e roda por padrão na URL: `http://localhost:8080`   
>
> Uma aplicação Web Java pode ter páginas HTML.   
>
> O `Servlet` é um objeto Java que pode ser chamado a partir de uma requisição HTTP.  
>
> Para mapear a URL é necessário utilizar a anotação `@WebServlet`, porém a classe deve ser extendida para a classe `HttpServlet` e sobrescrever um determinado método, por exemplo o `service`.  
>
> O método `service` recebe os objetos `HttpServletRequest` e `HttpServletResponse`.  
>
> Podemos utilizar o browser para passar a URL e verificar se a requisição está sendo passada, porém no navegador, não é possível ver todas as requisições, portanto, utiliza-se outra ferramente, como por exemplo o [Postman](https://www.postman.com/downloads/).
>
> Requisição POST, serve para alterar dados do servidor e o GET serve para acessar esses dados do servidor.  
>  
> JSP é uma tecnologia que renderiza as páginas no servidor antes de enviá-la.  
> Todo código (scriptlet) é executado no servidor antes de enviar a resposta para o navegador.  
> Sintaxe do Scriptlet:  

```Scriptlet 
<%
	String msg = "Bem-vindo";
	System.out.println(msg);
%>
```

```html
<%
     String nome = "Nico";
%>
<p><%= nome %></p>
```

> a sintaxe `<%= nome %>` é um atalho para não usar `out.println(nome);`

> JSP: Java Server Pages, é uma página automaticamente processada pelo Tomcat. Para gerar HTML dinamicamente no JSP utilizamos Scriptlets.  
> Scriptlet é um código Java dentro do HTML e só funciona num arquivo .jsp.
> `RequestDispatcher`: Permite, a partir de uma servlet, chamar um JSP. 
> E é obtido de um `HttpServletRequest` através do método `getRequestDispatcher()`.  
> 
> JSTL: Java Standard Tag Library, é uma biblioteca padrão de tags do Java, mas existem outras bibliotecas, por exemplo é o Spring MVC que possui uma prórpria.  
> O JSTL precisa ser adicionado a uma lib específica para que possa ser utilizado. Pois, não vem embutido no Tomcat (até a versão 9).  
> 
> O .jar do JSTL após ser baixado, deve ser colocado na seguinte pasta: `src/main/webapp/WEB-INF/lib`  
> O JSTL define 4 taglibs, as mais importantes são `core` (serve para controle de fluxo) e `fmt` (serve para formatação).

```
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
```

> EL: Expression Language, é uma linguagem simples e limitada para imprimir o resultado de uma expressão, sua sintaxe é: 

```
${...}
```
> 
> JSTL e EL devem ser usados em conjunto.  

> CRUD: Create, Read/Retrieve, Update, Delete  

> WAR: Web ARchive







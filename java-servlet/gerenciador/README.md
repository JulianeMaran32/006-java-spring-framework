
<h1>Projeto Servlet</h1>   

> A IDE utilizada para elabora��o deste projeto foi o [Eclipse](https://www.eclipse.org/downloads/).
>
> Utilizando [Apache Tomcat](https://tomcat.apache.org/) como servidor web.  
>
> O Tomcat, entende o protocolo HTTP e roda por padr�o na URL: `http://localhost:8080`   
>
> Uma aplica��o Web Java pode ter p�ginas HTML.   
>
> O `Servlet` � um objeto Java que pode ser chamado a partir de uma requisi��o HTTP.  
>
> Para mapear a URL � necess�rio utilizar a anota��o `@WebServlet`, por�m a classe deve ser extendida para a classe `HttpServlet` e sobrescrever um determinado m�todo, por exemplo o `service`.  
>
> O m�todo `service` recebe os objetos `HttpServletRequest` e `HttpServletResponse`.  
>
> Podemos utilizar o browser para passar a URL e verificar se a requisi��o est� sendo passada, por�m no navegador, n�o � poss�vel ver todas as requisi��es, portanto, utiliza-se outra ferramente, como por exemplo o [Postman](https://www.postman.com/downloads/).
>
> Requisi��o POST, serve para alterar dados do servidor e o GET serve para acessar esses dados do servidor.  
>  
> JSP � uma tecnologia que renderiza as p�ginas no servidor antes de envi�-la.  
> Todo c�digo (scriptlet) � executado no servidor antes de enviar a resposta para o navegador.  
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

> a sintaxe `<%= nome %>` � um atalho para n�o usar `out.println(nome);`

> JSP: Java Server Pages, � uma p�gina automaticamente processada pelo Tomcat. Para gerar HTML dinamicamente no JSP utilizamos Scriptlets.  
> Scriptlet � um c�digo Java dentro do HTML e s� funciona num arquivo .jsp.
> `RequestDispatcher`: Permite, a partir de uma servlet, chamar um JSP. 
> E � obtido de um `HttpServletRequest` atrav�s do m�todo `getRequestDispatcher()`.  
> 
> JSTL: Java Standard Tag Library, � uma biblioteca padr�o de tags do Java, mas existem outras bibliotecas, por exemplo � o Spring MVC que possui uma pr�rpria.  
> O JSTL precisa ser adicionado a uma lib espec�fica para que possa ser utilizado. Pois, n�o vem embutido no Tomcat (at� a vers�o 9).  
> 
> O .jar do JSTL ap�s ser baixado, deve ser colocado na seguinte pasta: `src/main/webapp/WEB-INF/lib`  
> O JSTL define 4 taglibs, as mais importantes s�o `core` (serve para controle de fluxo) e `fmt` (serve para formata��o).

```
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
```

> EL: Expression Language, � uma linguagem simples e limitada para imprimir o resultado de uma express�o, sua sintaxe �: 

```
${...}
```
> 
> JSTL e EL devem ser usados em conjunto.  

> CRUD: Create, Read/Retrieve, Update, Delete  

> WAR: Web ARchive







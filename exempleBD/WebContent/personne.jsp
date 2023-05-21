<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Liste des candidats</h1>

   
    <%
        List<PersonnBeane> candidats = PersonneBean.getAllCandidats();
    %>


    <% if (!candidats.isEmpty()) { %>

        
        <table>
            <tr>
                <th>id </th>
                <th>nom</th>
                <th>prénom</th>
            </tr>

            <% for (Personne candidat : candidats) { %>
                <tr>
                    <td><%= candidat.getId() %></td>
                    <td><%= candidat.getNom() %></td>
                    <td><%= candidat.getPrenom() %></td>
                </tr>
            <% } %>

        </table>

    <% } else { %>

        <p>Aucun candidat trouvé.</p>

    <% } %>
</body>
</html>
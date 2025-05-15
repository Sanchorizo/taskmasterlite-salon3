
  <h1>TaskMaster Lite 📝</h1>
  <blockquote>
    Gestionnaire de tâches en ligne de commande, écrit en Java.
  </blockquote>

  <hr>

  <p>
    <img src="https://img.shields.io/badge/Docs-HTML-blue" alt="Documentation"><br>  
    <img src="https://img.shields.io/badge/Tests-passing-brightgreen" alt="Tests"><br>  
  </p>

  <h2>🚀 Prérequis</h2>
  <ul>
    <li>Java 17+</li>
    <li>Maven</li>
    <li>Doxygen (pour la documentation)</li>
  </ul>

  <hr>

  <h2>▶️ Lancer l’application</h2>
  <hr>

  <h2>📋 Commandes disponibles</h2>
  <table>
    <thead>
      <tr>
        <th>Icône</th>
        <th>Commande</th>
        <th>Description</th>
      </tr>
    </thead>
    <tbody>
      <tr><td>➕</td><td><code>add "Ma tâche"</code></td><td>Ajouter une tâche (guillemets obligatoires)</td></tr>
      <tr><td>📑</td><td><code>list</code></td><td>Afficher toutes les tâches</td></tr>
      <tr><td>❓</td><td><code>help</code></td><td>Afficher l’aide</td></tr>
      <tr><td>🚪</td><td><code>exit</code></td><td>Quitter l’application</td></tr>
    </tbody>
  </table>
  <p><strong>Astuce :</strong> dès l’ajout d’une tâche, la liste se rafraîchit automatiquement !</p>

  <hr>

  <h2>🧪 Tests</h2>
  <p>Pour exécuter la suite de tests unitaires :</p>
  <pre><code>mvn test</code></pre>

  <hr>

  <h2>📚 Documentation</h2>
  <p><strong>Génération</strong></p>
  <pre><code>doxygen Doxyfile</code></pre>
  <p><strong>Visualisation locale</strong></p>
  <ul>
    <li><strong>macOS</strong> : <code>open docs/html/index.html</code></li>
    <li><strong>Linux</strong> : <code>xdg-open docs/html/index.html</code></li>
    <li><strong>Windows</strong> : <code>start docs\html\index.html</code></li>
  </ul>
  <p><strong>Documentation en ligne (GitHub Pages)</strong> :<br>
  <a href="https://sanchorizo.github.io/taskmasterlite-salon3/docs/html/index.html" target="_blank">
    https://headroom80.github.io/taskmasterlite-salon3/
  </a></p>

  <hr>


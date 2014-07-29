(defproject quil-cljs/lein-template "2.2.0"
  :description "Leiningen template for Quil ClojureScript project."
  :url "https://github.com/quil/quil-templates"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :singing {:gpg-key "norg113@gmail.com"}
  :deploy-repositories [["clojars" {:creds :gpg}]])

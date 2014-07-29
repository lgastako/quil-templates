(ns leiningen.new.quil-cljs
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "quil-cljs"))

(defn quil-cljs
  "ClojureScript template for Quil library."
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' quil-cljs project.")
    (->files data
             ["src/{{sanitized}}/core.cljs" (render "core.cljs" data)]
             ["project.clj" (render "project.clj" data)]
             ["web/index.html" (render "index.html" data)]
             ["web/js/processing-1.4.8.js" (render "processing-1.4.8.js" data)]
             ["LICENSE" (render "LICENSE" data)]
             [".gitignore" (render ".gitignore" data)]
             ["README.md" (render "README.md" data)])))
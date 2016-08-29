(ns cljs-lein-project.core
  (:require [ring.adapter.jetty :as jetty]
            [ring.middleware.defaults :refer [site-defaults wrap-defaults]]
            [compojure.core :refer [GET defroutes]]
            [compojure.response :refer [render]]
            [compojure.route :as route]
            [clojure.java.io :as io])
  (:gen-class))

;; Simple function that works as controller
;; It should return a proper response. In our
;; case it returns a content of static index.html.
(defn home [req]
  (render (io/resource "public/index.html") req))

;; Routes definition
(defroutes app-routes
  (GET "/" [] home)
  (route/resources "/static")
  (route/not-found "<h1>Page not found</h1>"))

(def app (wrap-defaults app-routes site-defaults))

(defn -main [& args]
  (jetty/run-jetty app {:port 8000}))

(ns clj-geoip-hiveudf.core-spec
  (:require [speclj.core :refer :all]
            [clj-geoip-hiveudf.core :refer :all]))

(def interlocutor "Bob Dobbs")

(describe "Salutation"
  (it (format "should be warmly welcoming to %s" interlocutor)
    (should=
      "Greetings of the day Bob Dobbs!"
      (hello-clj-geoip-hiveudf interlocutor))))

(describe "Valediction"
  (it (format "should be wistfully leave-taking of %s" interlocutor)
    (should=
      "Fare thee well Bob Dobbs!"
      (goodbye-clj-geoip-hiveudf interlocutor))))

(run-specs)

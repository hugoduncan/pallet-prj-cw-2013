(defproject myproject
  :phases {:configure (plan-fn (remote-file "f" :content "hello"))})

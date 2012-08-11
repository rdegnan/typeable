Data.Typeable
========

The Typeable class reifies types to some extent by associating type representations to types. These type representations can be compared, and one can in turn define a type-safe cast operation. To this end, an unsafe cast is guarded by a test for type (representation) equivalence. The module Data.Dynamic uses Typeable for an implementation of dynamics. The module Data.Data uses Typeable and type-safe cast (but not dynamics) to support the "Scrap your boilerplate" style of generic programming.
